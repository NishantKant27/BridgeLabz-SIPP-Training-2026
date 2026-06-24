interface HeartRateMonitor {
    void displayHeartRate(int heartRate);

    default void displayHealthTips() {
        System.out.println("Maintain a healthy heart with regular exercise.");
    }
}

interface TemperatureMonitor {
    void displayTemperature(double temperature);

    default void displayHealthTips() {
        System.out.println("Stay hydrated and monitor body temperature.");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.length() == 6;
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {

    public void displayHeartRate(int heartRate) {
        System.out.println("Heart Rate: " + heartRate + " bpm");
    }

    public void displayTemperature(double temperature) {
        System.out.println("Temperature: " + temperature + " °C");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public void generateReport(String name, String patientId,
                               int heartRate, double temperature) {

        System.out.println("\nPatient Name: " + name);
        System.out.println("Patient ID: " + patientId);

        if (TemperatureMonitor.isPatientIdValid(patientId)) {
            System.out.println("Patient ID Status: Valid");
            displayHeartRate(heartRate);
            displayTemperature(temperature);
        } else {
            System.out.println("Patient ID Status: Invalid");
        }
    }
}

public class SmartHealthcareMonitoringSystem {
    public static void main(String[] args) {

        String[] patientNames = {"Rahul", "Priya", "Aman", "Neha"};
        String[] patientIds = {"P12345", "P1234", "P54321", "P678"};

        int[] heartRates = {72, 85, 90, 78};
        double[] temperatures = {98.6, 99.1, 100.2, 98.4};

        HealthMonitoringSystem system = new HealthMonitoringSystem();

        system.displayHealthTips();

        System.out.println("\n----- Final Health Report -----");

        for (int i = 0; i < patientNames.length; i++) {
            system.generateReport(
                    patientNames[i],
                    patientIds[i],
                    heartRates[i],
                    temperatures[i]
            );
        }
    }
}