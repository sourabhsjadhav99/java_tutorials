// ==========================
// INTERFACE
// ==========================
interface Printable {
    void print();
}

// ==========================
// ENUM
// ==========================
enum UserRole implements Printable {

    ADMIN("Full Access", 1) {
        @Override
        public void showPermissions() {
            System.out.println("Can Create, Update, Delete");
        }
    },

    MANAGER("Limited Access", 2) {
        @Override
        public void showPermissions() {
            System.out.println("Can Create and Update");
        }
    },

    EMPLOYEE("Read Only", 3) {
        @Override
        public void showPermissions() {
            System.out.println("Can Only View");
        }
    };

    // Fields
    private String description;
    private int level;

    // Constructor
    UserRole(String description, int level) {
        this.description = description;
        this.level = level;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    // Normal Method
    public void displayInfo() {
        System.out.println(
            this + " | " + description + " | Level: " + level
        );
    }

    // Interface Method
    @Override
    public void print() {
        System.out.println("Printing Role: " + this);
    }

    // Abstract Method
    public abstract void showPermissions();
}

// ==========================
// MAIN CLASS
// ==========================
public class A18_enum {

    public static void main(String[] args) {

        System.out.println("===== ENUM CONSTANT =====");

        UserRole role = UserRole.ADMIN;

        System.out.println(role);

        System.out.println();

        System.out.println("===== GETTERS =====");

        System.out.println(role.getDescription());
        System.out.println(role.getLevel());

        System.out.println();

        System.out.println("===== NORMAL METHOD =====");

        role.displayInfo();

        System.out.println();

        System.out.println("===== INTERFACE METHOD =====");

        role.print();

        System.out.println();

        System.out.println("===== ABSTRACT METHOD =====");

        role.showPermissions();

        System.out.println();

        System.out.println("===== VALUES() =====");

        for (UserRole r : UserRole.values()) {
            System.out.println(r);
        }

        System.out.println();

        System.out.println("===== ORDINAL() =====");

        System.out.println(UserRole.ADMIN.ordinal());
        System.out.println(UserRole.MANAGER.ordinal());
        System.out.println(UserRole.EMPLOYEE.ordinal());

        System.out.println();

        System.out.println("===== VALUEOF() =====");

        UserRole r1 = UserRole.valueOf("MANAGER");
        System.out.println(r1);

        System.out.println();

        System.out.println("===== SWITCH =====");

        switch (role) {

            case ADMIN ->
                System.out.println("Admin Dashboard");

            case MANAGER ->
                System.out.println("Manager Dashboard");

            case EMPLOYEE ->
                System.out.println("Employee Dashboard");
        }

        System.out.println();

        System.out.println("===== LOOP THROUGH ALL ROLES =====");

        for (UserRole r : UserRole.values()) {

            r.displayInfo();
            r.showPermissions();

            System.out.println("-------------------");
        }
    }
}