var Circle = /** @class */ (function () {
  function Circle(radius) {
      this.radius = radius;
  }
  Circle.prototype.print = function () {
      return "The radius of Cicle is " + this.radius + "\nArea is " + (Math.PI * this.radius * this.radius);
  };
  return Circle;
}());
var Employee = /** @class */ (function () {
  function Employee(ename, eid, edesignatio) {
      this.eid = eid;
      this.ename = ename;
      this.edesignatio = edesignatio;
  }
  Employee.prototype.print = function () {
      return "Employee Details:\n" + "Employee Id:" + this.eid + "\n" + "Employee Name: " + this.ename
          + "\n" + "Employee Designation: " + this.edesignatio;
  };
  return Employee;
}());
function printAll(obj1, obj2) {
  console.log(obj1.print());
  console.log(obj2.print());
}
var circleObj = new Circle(2);
var employeeObj = new Employee("Ranjit", 01, "jr analyst");
printAll(circleObj, employeeObj);