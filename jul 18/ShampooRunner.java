class ShampooRunner {
    public static void main(String[] args) {
        Shampoo ref = new Shampoo();
        boolean output = ref.create("Dove", 250, "Moisturizing", 150.0, "15/01/2023", "15/01/2025");
        ref.getDetails();

        Shampoo ref1 = new Shampoo();
        output = ref1.create("Pantene", 300, "Anti-Dandruff", 180.0, "20/03/2023", "20/03/2025");
        ref1.getDetails();

        Shampoo ref2 = new Shampoo();
        output = ref2.create("Head & Shoulders", 400, "Anti-Hair Fall", 200.0, "10/05/2023", "10/05/2025");
        ref2.getDetails();

        Shampoo ref3 = new Shampoo();
        output = ref3.create("Herbal Essences", 500, "Volumizing", 250.0, "05/06/2023", "05/06/2025");
        ref3.getDetails();

        Shampoo ref4 = new Shampoo();
        output = ref4.create("Garnier", 350, "Strengthening", 170.0, "25/08/2023", "25/08/2025");
        ref4.getDetails();

        Shampoo ref5 = new Shampoo();
        output = ref5.create("L'Oreal", 450, "Color Protect", 220.0, "10/10/2023", "10/10/2025");
        ref5.getDetails();

        Shampoo ref6 = new Shampoo();
        output = ref6.create("Tresemme", 600, "Keratin Smooth", 300.0, "15/11/2023", "15/11/2025");
        ref6.getDetails();

        Shampoo ref7 = new Shampoo();
        output = ref7.create("Sunsilk", 200, "Thick & Long", 130.0, "12/02/2023", "12/02/2025");
        ref7.getDetails();

        Shampoo ref8 = new Shampoo();
        output = ref8.create("Clinic Plus", 250, "Daily Care", 120.0, "18/04/2023", "18/04/2025");
        ref8.getDetails();

        Shampoo ref9 = new Shampoo();
        output = ref9.create("Nivea", 300, "Repair & Targeted Care", 190.0, "22/07/2023", "22/07/2025");
        ref9.getDetails();

        Shampoo ref10 = new Shampoo();
        output = ref10.create("Aussie", 250, "Moisture", 140.0, "10/01/2023", "10/01/2025");
        ref10.getDetails();

        Shampoo ref11 = new Shampoo();
        output = ref11.create("Batiste", 200, "Dry Shampoo", 110.0, "05/03/2023", "05/03/2025");
        ref11.getDetails();

        Shampoo ref12 = new Shampoo();
        output = ref12.create("John Frieda", 400, "Frizz Ease", 210.0, "15/05/2023", "15/05/2025");
        ref12.getDetails();

        Shampoo ref13 = new Shampoo();
        output = ref13.create("OGX", 350, "Coconut Milk", 175.0, "20/06/2023", "20/06/2025");
        ref13.getDetails();

        Shampoo ref14 = new Shampoo();
        output = ref14.create("Schwarzkopf", 500, "Gliss Hair Repair", 260.0, "10/08/2023", "10/08/2025");
        ref14.getDetails();
    }
}