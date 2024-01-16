package com.example.CodeClash9.services;

import com.example.CodeClash9.DTOs.RoundDTO;
import com.example.CodeClash9.DTOs.UploadInfoDTOs;
import java.util.UUID;

public class CreationService {

	public RoundDTO uploadFile(UploadInfoDTOs uploadInfoDTO) {
		
		String gameFilePath = unzip(uploadInfoDTO.zipfile);
		
		// create game
		Game game = createGame();
		Integer gameId = getRandomId(game);
		game.gameId = gameId;
		game.gameFilePath = gameFilePath;
		
		// create student code
		StudentCode[] studentCodes = createTwoStudentCodes(game.gameFilePath);
		
		// create round;
		Round round = createNewRound(studentcodes[0], studentcode[1]);
		
		// convert the round entity into roundDTO
		RoundDTO roundDTO = round.convertToDTO();
		
		// convert the game entity into gameDTO
		GameDTO gameDTO = game.convertToDTO();
		
		return roundDTO;
	}
	
	public Game createGame() {
		return new Game();
	}
	
	public String getRandomId(Object entity) {
		String randomId = generateRandomId();
		if (entity instnaceOf Game) {
			// while randomId already exist in the entity
			// re-generate the randomId
		}
		else if(entity instnaceOf StudentCode) {
			// while randomId already exist in the entity
			// re-generate the randomId
		}
		else if (entity instnaceOf Round) {
			// while randomId already exist in the entity
			// re-generate the randomId
		}
		return randomId;
	}
	
	public Integer generateRandomId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString;
	}
	
	public ArrayList<StudentCode> createTwoStudentCodes(String gameFilePath){
		ArryList<File> files = readTwoFiles(gameFilePath);
		StudentCode studentCode1 = createStudentCode(files[0]);
		StudentCode studentCode2 = createStudentCode(files[1]);
		ArrayList<StudentCode> studentcodes = new ArrayList<>();
		studentcodes.add(studentCode1);
		studentcodes.add(studentCode2);
		
		return studentcodes;
		
	}
	
	public Round createNewRound(StudentCode studentcode1,StudentCode studentcode2) {
		Round round = new Round(studentcode1, studentcode2);
		Integer roundId = getRandomId(round);
		round.setRoundId(roundId);
		round.setStudentCode1(studentCode1);
		round.setStudentCode2(studentCode2);
		
		return round;
	}
}
