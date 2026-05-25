public class App {

    public static void main(String[] args) throws Exception {
        // Puedes probar aquí
        Brand[] brands = createBrands();
    }

    public static Brand[] createBrands() {

        // ===== VOLKSWAGEN =====
        CarYear[] golfYears = {
                new CarYear(2016, true),
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarYear[] passatYears = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarModel[] vwModels = {
                new CarModel("Golf", golfYears),
                new CarModel("Passat", passatYears)
        };

        Brand volkswagen = new Brand("Volkswagen", vwModels);

        // ===== TESLA =====
        CarYear[] model3Years = {
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true),
                new CarYear(2023, true)
        };

        CarYear[] modelYYears = {
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, true),
                new CarYear(2023, true),
                new CarYear(2024, false)
        };

        CarModel[] teslaModels = {
                new CarModel("Model 3", model3Years),
                new CarModel("Model Y", modelYYears)
        };

        Brand tesla = new Brand("Tesla", teslaModels);

        // ===== SUBARU =====
        CarYear[] imprezaYears = {
                new CarYear(2016, false),
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarYear[] foresterYears = {
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarModel[] subaruModels = {
                new CarModel("Impreza", imprezaYears),
                new CarModel("Forester", foresterYears)
        };

        Brand subaru = new Brand("Subaru", subaruModels);

        // ===== PEUGEOT =====
        CarYear[] pe208Years = {
                new CarYear(2016, true),
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarYear[] pe3008Years = {
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarModel[] peugeotModels = {
                new CarModel("208", pe208Years),
                new CarModel("3008", pe3008Years)
        };

        Brand peugeot = new Brand("Peugeot", peugeotModels);

        // ===== RENAULT =====
        CarYear[] clioYears = {
                new CarYear(2016, false),
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarYear[] dusterYears = {
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarModel[] renaultModels = {
                new CarModel("Clio", clioYears),
                new CarModel("Duster", dusterYears)
        };

        Brand renault = new Brand("Renault", renaultModels);

        // ===== VOLVO =====
        CarYear[] xc60Years = {
                new CarYear(2016, true),
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarYear[] s60Years = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarModel[] volvoModels = {
                new CarModel("XC60", xc60Years),
                new CarModel("S60", s60Years)
        };

        Brand volvo = new Brand("Volvo", volvoModels);

        // ===== MITSUBISHI =====
        CarYear[] lancerYears = {
                new CarYear(2016, true),
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarYear[] outlanderYears = {
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarModel[] mitsubishiModels = {
                new CarModel("Lancer", lancerYears),
                new CarModel("Outlander", outlanderYears)
        };

        Brand mitsubishi = new Brand("Mitsubishi", mitsubishiModels);

        return new Brand[] {
                volkswagen, tesla, subaru, peugeot,
                renault, volvo, mitsubishi
        };
    }
}