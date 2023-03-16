package com.example.hirportal01.service.impl;

import com.example.hirportal01.dto.LawDTO;
import com.example.hirportal01.entity.Law;
import com.example.hirportal01.repository.LawRepository;
import com.example.hirportal01.service.LawService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LawServiceImpl implements LawService {
    ModelMapper modelMapper;
    LawRepository lawRepository;

    public LawServiceImpl(ModelMapper modelMapper, LawRepository lawRepository) {
        this.modelMapper = modelMapper;
        this.lawRepository = lawRepository;
    }


    @Override
    public LawDTO create(LawDTO lawDTO) {
        lawDTO.setId(null);
        Law savedLaw = lawRepository.save(modelMapper.map(lawDTO, Law.class));
        return modelMapper.map(savedLaw,LawDTO.class);
    }

    @Override
    public List<LawDTO> findAll() {
        List<Law> allLaw=lawRepository.findAll();
        return allLaw.stream()
                .map(law -> modelMapper.map(law,LawDTO.class))
                .collect(Collectors.toList());
    }
}
