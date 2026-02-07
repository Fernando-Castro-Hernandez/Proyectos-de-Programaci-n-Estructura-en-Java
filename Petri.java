public class Petri {
    public static void main(String[] args) {

        /*
         * Estado inicial
         * X0 = [1 0 0 0 0 0 0 0]
         * transición habilitada : t1
         * x(p1) >= w(p1, t1)
         * 1 >= 1
         */

        // x´(p1) = x(p1) - w(p1, t1) + w(t1, p1) = 1 - 1 + 0 = 0
        // x´(p2) = x(p2) - w(p2, t1) + w(t1, p2) = 0 - 0 + 1 = 1
        // x´(p3) = x(p3) - w(p3, t1) + w(t1, p3) = 0 - 0 + 1 = 1
        // x´(p4) = x(p4) - w(p4, t1) + w(t1, p4) = 0 - 0 + 1 = 1
        // x´(p5) = x(p5) - w(p5, t1) + w(t1, p5) = 0 - 0 + 0 = 0
        // x´(p6) = x(p6) - w(p6, t1) + w(t1, p6) = 0 - 0 + 0 = 0
        // x´(p8) = x(p8) - w(p8, t1) + w(t1, p8) = 0 - 0 + 0 = 0
        // x´(p7) = x(p7) - w(p7, t1) + w(t1, p7) = 0 - 0 + 0 = 0

        // Nuevo estado
        // X1 = [0 1 1 1 0 0 0 0]

    }
}