package employeemanagement;

import java.util.Scanner;
    public class Officer extends Employee {
        //Lớp Officer: department, level
        private int department;
        private int level;

        public Officer() {

        }

        public Officer(int department, int level,String name,String gender,String birthday,String address) {
            super(name, gender, birthday, address);
            this.department = department;
            this.level = level;
        }

        public int getDepartment() {
            return department;
        }

        public void setDepartment(int department) {
            this.department = department;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

    }

