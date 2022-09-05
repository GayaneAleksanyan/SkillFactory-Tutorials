package exceptions.extendedClassesExceptions;

public class ExtendedClassesExCatch {
    class A extends java.lang.Exception {
        A(String msg) {
            super(msg);
        }
    }

    class B extends A {
        B(String msg) {
            super(msg);
        }
    }

    class C extends B {
        C(String msg) {
            super(msg);
        }
    }

    class D extends A {
        D(String msg) {
            super(msg);
        }
    }

    class E extends A {
        E(String msg) {
            super(msg);
        }
    }

    class F extends D {
        F(String msg) {
            super(msg);
        }
    }

    class G extends D {
        G(String msg) {
            super(msg);
        }
    }

    class H extends E {
        H(String msg) {
            super(msg);
        }
    }

    public void main(String[] args) {
        try {
            switch (args[0]) {
                case "c":
                    throw new C("C");
                case "d":
                    throw new D("D");
                case "g":
                    throw new G("G");
                case "H":
                    throw new H("H");
            }
//  *Version 1*
//        } catch (E e) {
//            //
//        } catch (D d) {
//
//        } catch (B b) {
//
//        } catch (A a) {
//
//        }

//*Version 2*
//        } catch (C c) {
//            //
//        } catch (D d) {
//
//        } catch (H h) {
//
//        } catch (A a) {
//
//        }

//*Version 3*
        } catch (C c) {
            //
        } catch (D d) {

        } catch (E e) {

        } catch (A a) {

        }

    }
}
