                                           SYSC3303
                                           PROJECT
                                           GROUP 10
                                           ITERATION 4


GROUP MEMBERS

Charles Chen 101035684
Osama Khan 101009441
Taihe Chen 101047827
Xuan Zhang 100966284
Yiqi Wu   101044214 

FILE LIST


src
	main:
		Elevator.java	        --------> Elevator Object.
		ElevatorManager.java	--------> Elevator Object Manager.
		ElevatorSchedular.java	--------> Elevator Schedular that controls one elevator.
		Floor.java	            --------> Floor Object.
		FloorManager.java       --------> Floor Object and Input file Manager.
		Request.java	        --------> Request Object.
		Schedular.java          --------> Schedular that controls all elevators.
		SchedularGUI,java       --------> GUI class
		
	util:
		ModelUtil.java               -------->contains global function that not relate to socket and packet
		NetworlUtil.java             -------->an helper class contain useful global method
		Pair.java	                 -------->the helper class of creating a Pair<K,V>
		LoggerManager.java	         -------->Merges all the console from the 3 subsystems into 1
		ElevatorErrorState.java	     -------->Enum class that contain the error state for the system
		RequestState.java	         -------->Enum class that contains the state for the request being sent
	module-info.java:
		sysc3303ProjectSetup --------> Necessary module to setup the project.

JRE System Library           --------> Necessary JRE Library.
Referenced Libraries         --------> Necessary Libraries.
Javafx-sdk-11                --------> Necessary Javafx SDK.
request file.txt             --------> Test file.
UML.pdf                      --------> UML class diagram.
ElevatorState.pdf            --------> State machine diagram for elevator subsystem.
SchedulerState.pdf           --------> State machine diagram for scheduler subsystem.
README.txt                   --------> this file.
timing diagram
	iteration 2
		ElevatorManager lost packet.png	-----> timing diagram for error case in ElevatorManager
		FloorManager lost packet.png	-----> timing diagram for error case in FloorManager 
		Schedular lost packet 1.png	-----> timing diagram for error case 1 in Schedular (ElevatorSchedular)
		Schedular lost packet 2.png	-----> timing diagram for error case 2 in Schedular (ElevatorSchedular)
	iteration 3
		Schedular lost packet 2.png	-----> timing diagram for error case of elevator door stuck
	Timing diagram for IT4.pdf
	3303Package Receive Timer Measurements.pdf
output.log                 ----------> the logger file for the project	
Test and RMA               ----------> the tests result and the RMA
SYSC3303L3G10              ----------> the report

	

THE GOAL

The goal of this iteration is to measure the performance of the scheduler subsystem when sending different request when running on the different computers




SETUP INSTRUCTIONS
*This Project is Built On JAVA 10*
1. Download project from CULearn, save it and unzip it
2. Open Eclipse, File->Import->General->Existing Projects into Workspace
3. Select where you unzip the file



TEST INSTRUCTIONS
1. Open the NetworlUtil.java class and set the IP for the variables FLOOR_IP,ELEVATOR_IP,LOGGER_IP to the IP of the computer they are running on (computer A)
2. Set the SCHEDULAR_IP to the seperate computer in NetworlUtil.java class (computer B)
3. The "request file.txt" is the Test File used in this project. You can modify this file before you input this file, but make sure you follow the format.
4. Run the following class in order: 
	1) LoggerManager.java(in util package, computer A)
	2) on the same computer (computer A), ElevatorManager.java
	3) on the another computer (computer B) SchedularGUI.java
	4) on the same computer (computer A) FloorManager.java 
5. After all requests have done, terminate the project and refresh, there will be a log file named 'output.log'
 


Request File Breakdown (request file.txt)
"Amount of time before request is sent" "Floor user has requested elevator" "Direction they are going" "Floor they are going to" "Elevator Error Code"

Elevator Error Code Breakdown (as defined in enum class, ElevatorErrorState.java)
0-> Normal
1-> Stuck Between Floors
2-> Stuck door
3-> Sensor Failure


RESPONSIBILITY BREAKDOWN FOR ITERATION 4

Osama Khan: Work on getting the scheduler working on a separate computer

Charles Chen: Help out with the the timing diagrams and testing table and helping Osama with his tasks

Taihe Chen: Work with Xuan on timing performance of the system, helped to finish the testing table

Xuan Zhang: helped out Taihe Chen and Yiqi

Yiqi Wu: Worked on the timing diagrams and testing table for this iteration.






IMPROTANCE

if git-pull shows conflicts, please do git-stash to save your work, (by right click this project-> team -> stashes->create stashes), then git-pull. After that, to restore your changes, do a git-stash-pop (by right click this project-> team -> stashes-> <your stashed change> -> on the top right corner, click "Apply Stashed Changes" button). If no problem happens, then you can delete this stash. If still says conflicts, then use merge tool (same progress -> merge tool)

If git-pull encouters NullPointerException, just ignore it, it's a bug in eclipse right now, but the git-pull command is successed

If you git-push fails and says not fast forward, that means you didn't do the git-pull before git-push, do it first.

If you encounter others git- problems, just speak to the group chat.
