# Directed Weighted Graph Algorithms:                                                                
## Dor Harizi
---
This project gives a response to the The problem of the placement of calls for elevators in a given building, so that the average for making each elevator call will be lower than possible. 

---

## Algorithm features

*	Matching elevator is chosen based on the formula: state of the elevator + the expected time the elevator will travel from floor a to floor b
*	If pickup call happens in the same direction as a previous call it is assigned to the elevator already having this path
*	Elevator picks up the passengers only in the same direction which minimizes their travel time in case elevator is going way too far in opposite direction
*	The Elevator's class will automatically create a matrix for each elevator. the matrix will represent the fastest time the elevator will travel from floor a to floor    b, and has a main rule in the allocation system

Reference to the UML: [ click here](#Smart-Elevator-UML)  
Reference to how to use: [ click here](#How-to-use)

---
## How to use the program:
Clone the repository 
```
git clone https://github.com/DorHarizi/Dor_Harizi_2_Year_Ex1-oop_Python.git 
```
Run the program from the cmd: building file.json , call file.csv, output file.csv 
```
python Ex1.py <building_json_file_name> <calls_csv_file_name> <output_file_name>
```
----
## Testing jar
To get the reslut run the simulator Ex1_checker_V1.2_obf.jar
```
java -jar Ex1_checker_V1.2_obf.jar <ID, building.json, calls.csv, out.log>
```

---
## Smart Elevator UML:

<p align="center">
    <img width="800" height="900" src="https://github.com/DorHarizi/Dor_Harizi_2_Year_Ex2_java/blob/master/src/Graph/UML.png">
   </p>
   
---

## Results for the avarage waiting time: 

|           | **B1** | **B2** | **B3** | **B4** | **B5** |
|-----------|--------|--------|--------|--------|--------|
|**Calls_a**|	112.9	 | 68.69  | 54.44  | 66     |	26.7   |
|**Calls_b**|		     |        | 762.2  | 785.6  |	469.2  |
|**Calls_c**|		     |        | 775.8  | 831.1  |	505    |
|**Calls_d**|		     |        | 775.8  | 831.1  |	505    |  

 *The buildings B1, B2 can be tested only on calls_a*
 
 *Values were rounded to 1 digit after the decimal point.*
 
 ---
