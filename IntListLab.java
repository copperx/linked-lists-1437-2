// Runs IntList and prints what each method gives (got) next to what
// it should give (expected). Do not change this file.
//
//     javac *.java
//     java IntListLab

public class IntListLab {
    static int ok = 0;
    static int total = 0;

    static void check(String what, Object got, Object expected) {
        total = total + 1;
        boolean same = String.valueOf(got).equals(String.valueOf(expected));
        if (same) {
            ok = ok + 1;
        }
        System.out.println(what);
        System.out.println("   got:      " + got);
        System.out.println("   expected: " + expected + (same ? "   OK" : "   <-- not yet"));
    }

    public static void main(String[] args) {
        IntList list = new IntList();
        System.out.println("== In class: addFirst and toString");
        check("new list", list, "null");
        list.addFirst(15);
        list.addFirst(8);
        list.addFirst(4);
        check("addFirst 15, then 8, then 4", list, "4 -> 8 -> 15 -> null");

        System.out.println();
        System.out.println("== Part 1: size");
        check("size of 4 -> 8 -> 15", list.size(), 3);
        check("size of the empty list", new IntList().size(), 0);

        System.out.println();
        System.out.println("== Part 2: contains");
        check("contains 4 (the first item)", list.contains(4), true);
        check("contains 15 (the last item)", list.contains(15), true);
        check("contains 9 (not there)", list.contains(9), false);
        check("empty list contains 4", new IntList().contains(4), false);

        System.out.println();
        System.out.println("== Part 3: addLast");
        list.addLast(16);
        check("addLast 16", list, "4 -> 8 -> 15 -> 16 -> null");
        IntList empty = new IntList();
        try {
            empty.addLast(7);
            check("addLast 7 on the empty list", empty, "7 -> null");
        } catch (NullPointerException e) {
            check("addLast 7 on the empty list", "NullPointerException", "7 -> null");
        }

        System.out.println();
        System.out.println("== Challenge: removeFirst");
        check("removeFirst returns", list.removeFirst(), 4);
        check("list after removeFirst", list, "8 -> 15 -> 16 -> null");
        IntList none = new IntList();
        check("removeFirst on the empty list", none.removeFirst(), -1);

        System.out.println();
        System.out.println(ok + " of " + total + " checks OK");
    }
}