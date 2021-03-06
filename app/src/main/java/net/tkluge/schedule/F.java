package net.tkluge.schedule;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by kluget on 5/11/2015.
 */
class F {
    public static void hi() {
        nl("Hello world!");
    }
    public static void nl(Object o) {
        System.out.println(o);
    }
    public static void l(Object o) {
        System.out.print(o);
    }
    public static void nl() {
        System.out.println();
    }
    public static void pa(Object[] o) {
        int i = 0;
        for(Object obj : o) {
            nl(i + ": " + obj.toString());
            i++;
        }
    }
    public static void pa2d(Object[][] o) {
        int i = 0, c = 0;
        for (Object[] obj1 : o) {
            l(i + ": ");
            for (Object obj2 : obj1) {
                l(obj2.toString() + "\t\t");
            }
            F.nl();
        }
    }
    public static void pm(Map m) {
        if (m != null) {
            int i = 0;
            Iterator it = ((Map) m).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                nl(i + ": " + pair.getKey() + " = " + pair.getValue());
                it.remove();
                i++;
            }
        } else {
            throw new NullPointerException("F.pm(Map m) cannot be null");
        }
    }
    public static void pm2d(Map m) {
        if (m != null) {
            int i = 0;
            Iterator it = m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();

                nl(i + ": " + pair.getKey() + " = ");
                if (pair != null) {
                        int c = 0;
                        Iterator it2 = ((Map)pair.getValue()).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry pair2 = (Map.Entry) it2.next();
                            nl(c + ": " + pair2.getKey() + " = " + pair2.getValue());
                            it2.remove();
                            c++;
                        }
                    } else {
                        throw new NullPointerException("F.pm(Map m) cannot be null");
                    }

                it.remove();
                i++;
            }
        } else {
            throw new NullPointerException("F.pm(Map m) cannot be null");
        }
    }
}
