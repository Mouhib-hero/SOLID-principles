package OCP.Exercise_refactored;

import java.util.List;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(List<Resource> resources) {
        for (Resource resource : resources) {
            int resourceId = resource.allocate();
            if (resourceId == INVALID_RESOURCE_ID) {
                System.out.println("ERROR: Attempted to allocate invalid resource");
                break;
            }
        }
        return 0;
    }

    public void free(List<Resource> resources) {
        for (Resource resource : resources) {
            resource.free(resource.getResourceId());
        }
    }
}