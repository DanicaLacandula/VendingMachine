public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory;
    private double balance;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0.0;
        this.currentState = new IdleState(); // Initial state
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    // Delegated methods
    public void selectItem() { currentState.selectItem(this); }
    public void insertCoin() { currentState.insertCoin(this); }
    public void dispenseItem() { currentState.dispenseItem(this); }
    public void setOutOfOrder() { currentState.setOutOfOrder(this); }

    // Getters/Seters for inventory and balance
    public int getInventory() { return inventory; }
    public void setInventory(int inventory) { this.inventory = inventory; }
}