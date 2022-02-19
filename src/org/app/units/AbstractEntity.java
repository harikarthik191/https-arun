package org.app.units;

public abstract class AbstractEntity {

         private int id;
        //abstract methods have to be implemented in derived classes
        public abstract void autoGenerateId();

        public int getId() {
            return id;
        }
        public void setId(int id){
            this.id=id;
        }
    }