package sort_algorithms;
import java.security.Key;
import java.util.ArrayList;

import static sort_algorithms.Actions.*;

public class TreeBinary {

    public static void sort (Comparable[] array){
        Tree tree=new Tree(array[0]);
        for (int i = 1; i < array.length; i++) {
            tree.insert(new Tree(array[i]));
        }

        KeyPrinter collectResult=new KeyPrinter();
        tree.traverse(collectResult);

        for (int i = 0; i <array.length ; i++) {
            array[i]=collectResult.result.get(i);
        }

    }


    public static void main(String[] args) {
        TreeBinary treeBinary=new TreeBinary();
        Comparable[] array={2,5,9,1,3,8,3,6};

        treeBinary.sort(array);
        new String();
    }

    private static class Tree{
        public Tree left;            // левое и правое поддеревья и ключ
        public Tree right;
        public Comparable key;

        public Tree(Comparable k) {        // конструктор с инициализацией ключа
            key = k;
        }
        public void insert( Tree subTree) {
            if ( less(subTree.key,key) ) {
                if ( left != null ) left.insert( subTree );
                else left = subTree;
            } else
            if ( right != null ) right.insert( subTree );
            else right = subTree;
        }

        public void traverse(TreeVisitor visitor) {
            if ( left != null)
                left.traverse( visitor );

            visitor.visit(this);

            if ( right != null )
                right.traverse( visitor );
        }

        interface TreeVisitor {
            public void visit(Tree node);
        };
    }
    static class KeyPrinter  implements Tree.TreeVisitor {
        ArrayList<Comparable>result=new ArrayList<>();

        public void visit(Tree node){
            result.add(node.key);
        }
    };

}
