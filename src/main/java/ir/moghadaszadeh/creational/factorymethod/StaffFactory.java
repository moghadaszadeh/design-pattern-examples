package ir.moghadaszadeh.creational.factorymethod;

@SuppressWarnings("unchecked")
public class StaffFactory {

    private final static String SUPPORT = "SUP";
    private final static String TECHNICAL = "TEC";
    private final static String SALE = "SAL";

    public static <T extends Staff> T getStaff(String code) {
        Staff staff = null;
        if (code.startsWith(SUPPORT)) {
            staff = new Support("Ema","SUP-2349","Technical Support");
        }
        if (code.startsWith(TECHNICAL)) {
            staff = new Technical("Jack","TEC-7984","System Admin");
        }
        if (code.startsWith(SALE)) {
            staff = new Sale("Leo","SAL-2321","Saleman");
        }
        return (T) staff;
    }
}
