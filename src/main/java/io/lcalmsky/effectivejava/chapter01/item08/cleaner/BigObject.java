package io.lcalmsky.effectivejava.chapter01.item08.cleaner;

import java.util.List;

public class BigObject {

    private List<Object> resource;

    public BigObject(List<Object> resource) {
        this.resource = resource;
    }

    public static class ResourceCleaner implements Runnable {

        private List<Object> resourcesToClean;

        public ResourceCleaner(List<Object> resourcesToClean) {
            this.resourcesToClean = resourcesToClean;
        }

        @Override
        public void run() {
            resourcesToClean = null;
            System.out.println("cleaned up");
        }
    }
}
