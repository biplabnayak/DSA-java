package io.example.dsa.core.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashmapTest {
    public static void main(String[] args) {
        Map<Emp, String> map = new HashMap<>();
        //LinkedHashMap
        int i = 1;
        for (; i<=1000; i++) {
            map.put(new Emp(i,"Name " + i, "Computer"), "");
        }

        map.put(new Emp(i,"Name " + i, "Computer"), "");
    }

    private static class Emp {
        Integer empId;
        String empName;
        String empDepartment;

        public Emp(Integer empId, String empName, String empDepartment) {
            this.empId = empId;
            this.empName = empName;
            this.empDepartment = empDepartment;
        }

        public Integer getEmpId() {
            return empId;
        }

        public void setEmpId(Integer empId) {
            this.empId = empId;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getEmpDepartment() {
            return empDepartment;
        }

        public void setEmpDepartment(String empDepartment) {
            this.empDepartment = empDepartment;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Emp emp = (Emp) o;
            return Objects.equals(empId, emp.empId) && Objects.equals(empName, emp.empName) && Objects.equals(empDepartment, emp.empDepartment);
        }

        @Override
        public int hashCode() {
            //return Objects.hash(empId, empName, empDepartment);
            return this.empId;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "empId=" + empId +
                    ", empName='" + empName + '\'' +
                    ", empDepartment='" + empDepartment + '\'' +
                    '}';
        }
    }
}
