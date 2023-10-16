package OCP.Exercise_refactored;

public class TimeSlot implements Resource {
    private int resourceId;  

    public TimeSlot(int resourceId) {
        this.resourceId = resourceId;
    }
    
    @Override
    public int getResourceId(){
        return this.resourceId;
    }
    
    @Override
    public int allocate() {
        resourceId = findFreeTimeSlot(); //the resourceId of the resource to allocate
        markTimeSlotBusy(resourceId);
        // in case of error with the resource allocation
        if (resourceId == -1){
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return -1;
        }
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
        //in case of error with the resource freeing
        if (resourceId == -1){
            System.out.println("ERROR: Attempted to allocate invalid resource");
        }        
    }
    public void markTimeSlotFree(int resourceId) {
    }

    public void markTimeSlotBusy(int resourceId) {
    }

    public int findFreeTimeSlot() {
        return 0;
    }
}
