package org.example.model;

public class Bogie {

        private String name;
        private String type;
        private int capacity;

        public Bogie() {
        }

        public Bogie(String name, String type, int capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
}
