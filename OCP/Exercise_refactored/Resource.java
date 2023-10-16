package OCP.Exercise_refactored;

public interface Resource {
    int allocate();
    void free(int resourceId);
    int getResourceId();
}