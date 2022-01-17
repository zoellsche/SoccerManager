public class APP {

    public static void main(String[] args) {

        System.out.println("Start");

        Coach c = new Coach();
        c.setName("Peter");
        c.setExperience();

        System.out.println(c.getExperience());

        System.out.println(c.getName());

        System.out.println(c.getExperience());

        System.out.println("Ende");


    }
}
