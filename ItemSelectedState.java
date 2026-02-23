public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted.");
        // Transition to dispensing (simplified logic)
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing started...");
        machine.setState(new DispensingState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
    }
}