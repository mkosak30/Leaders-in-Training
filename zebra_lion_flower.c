#include <stdio.h>

// Defining a structure for a leader in training
typedef struct {
	int ID;
	char name[50];
	int teamID;
	int yearsExperience;
	char certifications[100];
	char programType[50];
} LeaderInTraining;

/* Function prototypes */
void displayLeaders(LeaderInTraining[], int);
void addLeader(LeaderInTraining[], int*);
int searchLeader(LeaderInTraining[], int, int);
void updateLeader(LeaderInTraining[], int, int);
void deleteLeader(LeaderInTraining[], int*, int);

int main() {
	int choice;
	int nLeaders = 0; // Count of leaders initially zero
	LeaderInTraining leaders[100]; // Declaring an array of LeadersInTraining

	while (1) {
		// Menu for user to select a choice
		printf("\nLeaders In Training Program\n");
		printf("1. Display Leaders \n");
		printf("2. Add new Leader \n");
		printf("3. Search Leader \n");
		printf("4. Update Leader \n");
		printf("5. Delete Leader \n");
		printf("6. Exit \n");

		printf("\nEnter your choice: ");
		scanf("%d", &choice);

		switch (choice) {
			case 1: // Display all Leaders in the program
				displayLeaders(leaders, nLeaders);
				break;
			case 2: // Add a new Leader to the program
				addLeader(leaders, &nLeaders);
				printf("\nNew leader successfully added\n");
				break;
			case 3: // Search for a Leader in the program
				{
					int leaderID;
					printf("\nEnter the Leader ID: ");
					scanf("%d", &leaderID);
					int result = searchLeader(leaders, nLeaders, leaderID);
					if (result == -1)
						printf("\nLeader does not exist\n");
					else 
						printf("\nLeader found\n");
				}
				break;
			case 4: // Update a Leader in the program
				{
					int leaderID;
					printf("\nEnter the Leader ID: ");
					scanf("%d", &leaderID);
					int result = searchLeader(leaders, nLeaders, leaderID);
					if (result == -1)
						printf("\nLeader does not exist\n");
					else {
						updateLeader(leaders, nLeaders, leaderID);
						printf("\nLeader successfully updated\n");
					}
				}
				break;
			case 5: // Delete a Leader from the program
				{
					int leaderID;
					printf("\nEnter the Leader ID: ");
					scanf("%d", &leaderID);
					int result = searchLeader(leaders, nLeaders, leaderID);
					if (result == -1)
						printf("\nLeader does not exist\n");
					else {
						deleteLeader(leaders, &nLeaders, leaderID);
						printf("\nLeader successfully deleted\n");
					}
				}
				break;
			case 6: // Choose to exit the menu 
				printf("\nExiting the program....\n");
				return 0;
			default: // Handle wrong selection
				printf("\nInvalid option entered\n");
				break;
		}
	}
}

// Function to display all Leaders in the program
void displayLeaders(LeaderInTraining leaders[], int nLeaders) {
	if (nLeaders == 0)
		printf("\nNo Leaders in the program\n");
	else {
		printf("\nID\tName\t\tTeamID\tYearsExperience\tCertifications\tProgramType\n");
		for (int i = 0; i < nLeaders; i++)
			printf("%d\t%s\t\t%d\t%d\t\t%s\t\t%s\n", leaders[i].ID, leaders[i].name, leaders[i].teamID, leaders[i].yearsExperience, leaders[i].certifications, leaders[i].programType);
	}
}

// Function to add a new Leader to the program
void addLeader(LeaderInTraining leaders[], int* nLeaders) {
	printf("\nAdding new Leader\n");
	leaders[*nLeaders].ID = *nLeaders;
	printf("\nEnter name: ");
	scanf("%s", leaders[*nLeaders].name);
	printf("\nEnter teamID: ");
	scanf("%d", &leaders[*nLeaders].teamID);
	printf("\nEnter years of experience: ");
	scanf("%d", &leaders[*nLeaders].yearsExperience);
	printf("\nEnter certifications: ");
	scanf("%s", leaders[*nLeaders].certifications);
	printf("\nEnter programType: ");
	scanf("%s", leaders[*nLeaders].programType);
	(*nLeaders)++;
}

// Function to search for a Leader in the program
int searchLeader(LeaderInTraining leaders[], int nLeaders, int leaderID) {
	for (int i = 0; i < nLeaders; i++) 
		if (leaders[i].ID == leaderID)
			return i;
	return -1;
}

// Function to update a Leader in the program
void updateLeader(LeaderInTraining leaders[], int nLeaders, int leaderID) {
	int index = searchLeader(leaders, nLeaders, leaderID);
	if (index != -1) {
		printf("\nEnter name: ");
		scanf("%s", leaders[index].name);
		printf("\nEnter teamID: ");
		scanf("%d", &leaders[index].teamID);
		printf("\nEnter years of experience: ");
		scanf("%d", &leaders[index].yearsExperience);
		printf("\nEnter certifications: ");
		scanf("%s", leaders[index].certifications);
		printf("\nEnter programType: ");
		scanf("%s", leaders[index].programType);
	}
}

// Function to delete a Leader from the program
void deleteLeader(LeaderInTraining leaders[], int* nLeaders, int leaderID) {
	int index = searchLeader(leaders, *nLeaders, leaderID);
	if (index != -1) {
		for (int i = index; i < *nLeaders - 1; i++)
			leaders[i] = leaders[i + 1];
		(*nLeaders)--;
	}
}