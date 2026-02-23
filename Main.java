public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);

        machine.selectItem();  // Transition to ItemSelected
        machine.insertCoin();  // Transition to Dispensing
        machine.dispenseItem(); // Transition back to Idle
        
        machine.setOutOfOrder();
        machine.selectItem();  // Should show "Out of Order"
    }
}