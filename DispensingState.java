public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) { System.out.println("Currently dispensing. Please wait."); }
    @Override
    public void insertCoin(VendingMachine machine) { System.out.println("Currently dispensing. Please wait."); }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed.");
        // Logic to update inventory/balance would go here
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) { machine.setState(new OutOfOrderState()); }
}