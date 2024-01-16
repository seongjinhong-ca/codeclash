package com.example.CodeClash9.entity;

import jakarta.persistence.Entity;

@Entity
public class Round {

	Integer roundId;
	StudentCode studentcode1;
	StudentCode studentcode2;
	
	Round(StudentCode studentCode1, StudentCode studentCode2){
		studentcode1 = studentCode1;
		studentcode2 = studentCode2;
		
	}
}
