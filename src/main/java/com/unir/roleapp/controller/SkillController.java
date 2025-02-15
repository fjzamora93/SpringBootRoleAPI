package com.unir.roleapp.controller;

import com.unir.roleapp.dto.SkillDTO;
import com.unir.roleapp.entity.CharacterEntity;
import com.unir.roleapp.entity.Skill;
import com.unir.roleapp.repository.SkillRepository;
import com.unir.roleapp.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<SkillDTO> getAllSkills() {
        return skillService.getSkills();
    }

    /** Añadir Skill a Character */
    @PostMapping("/skill")
    public ResponseEntity<CharacterEntity> addSkillToCharacter(
            @RequestParam Long characterId,
            @RequestParam Long skillId) {
        CharacterEntity updatedCharacter = skillService.addSkillToCharacterEntity(characterId, skillId);
        return ResponseEntity.ok(updatedCharacter);
    }

    /** Eliminar Skill de Character */
    @DeleteMapping("/skill")
    public ResponseEntity<CharacterEntity> deleteSkillFromCharacter(
            @RequestParam Long characterId,
            @RequestParam Long skillId) {
        CharacterEntity updatedCharacter = skillService.deleteSkillFromCharacterEntity(characterId, skillId);
        return ResponseEntity.ok(updatedCharacter);
    }

}
