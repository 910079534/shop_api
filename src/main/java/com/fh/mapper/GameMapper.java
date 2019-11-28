package com.fh.mapper;

import com.fh.model.Game;

import java.util.List;
import java.util.Map;

public interface GameMapper {
    List<Game> queryList(Map<String,Object> map);

    void deletegame(Integer id);

    void updagteame(Game game);

    int queryCount(Map<String,Object> map);

    void addgame(Game game);
}
