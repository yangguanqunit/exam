/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class HuffmanTree {

    static int sum = 0;

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        HuffmanTree huff = new HuffmanTree();

        ArrayList<node> nodelist = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            nodelist.add(new node(scanner.nextInt()));

        }
        while (nodelist.size() > 1) {
            huff.downtwo(nodelist, n--);
        }
        huff.leaf(nodelist.get(0), -1);
        System.out.print(sum);

    }

    public node downtwo(ArrayList nodelist, int n) {
        node node_1;
        node node_2;
        node_1 = min(nodelist, n--);
        node_2 = min(nodelist, n);
        node node_3 = new node(node_1.value + node_2.value);
        node_3.leftchild = node_1;
        node_3.rightchild = node_2;
        nodelist.add(node_3);

        return node_3;
    }

    public node min(ArrayList<node> nodelist, int n) {
        int min = nodelist.get(0).value;
        int index = 0;
        node tmp = null;
        for (int i = 0; i < n; i++) {
            if (nodelist.get(i).value < min) {
                min = nodelist.get(i).value;
                index = i;
            }
        }
        tmp = nodelist.get(index);
        nodelist.remove(index);
        return tmp;
    }

    public int leaf(node nodes, int high) {
        ++high;
        if (nodes.leftchild != null) {
            leaf(nodes.leftchild, high);

        }
        if (nodes.rightchild != null) {
            leaf(nodes.rightchild, high);
            sum -= high * nodes.value;
        }

        sum += high * nodes.value;
        return 0;

    }

    static private class node {

        public int value;
        public node leftchild = null;
        public node rightchild = null;

        public node(int value) {
            this.value = value;
        }

    }

}
