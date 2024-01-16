package com.example.CodeClash9.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.CodeClash9.DTOs.UploadInfoDTOs;

@RestController
public class Controller {
	
	@GetMapping("upload/zipfile")
	ResponseEntity<RoundDTO, GameDTO> uploadZipFile(UploadInfoDTOs uploadInfoDTO){
		RoundDTO roundDTO = CreationService.uploadFile(uploadInfoDTO);
		
		return Response.ok(roundDTO);
	}
	
}
