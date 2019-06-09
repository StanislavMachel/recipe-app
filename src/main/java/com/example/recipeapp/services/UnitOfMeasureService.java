package com.example.recipeapp.services;

import com.example.recipeapp.commands.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

import java.util.Set;

public interface UnitOfMeasureService {
    Flux<UnitOfMeasureCommand> listAllUoms();
}
