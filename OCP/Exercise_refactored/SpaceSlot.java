package OCP.Exercise_refactored;

public class SpaceSlot implements Resource {
    private int resourceId;  

    public SpaceSlot(int resourceId) {
        this.resourceId = resourceId;
    }
    @Override
    public int getResourceId(){
        return this.resourceId;
    }

    @Override
    public int allocate() {
        resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        // in case of error with the resource allocation
        if (resourceId == -1){
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return -1;
        }
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
        //in case of error with the resource freeing
        if (resourceId == -1){
            System.out.println("ERROR: Attempted to allocate invalid resource");
        }        
    }
    public void markSpaceSlotFree(int resourceId) {
    }

    public void markSpaceSlotBusy(int resourceId) {
    }

    public int findFreeSpaceSlot() {
        return 0;
    }
}
