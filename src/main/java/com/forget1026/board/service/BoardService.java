package com.forget1026.board.service;

import com.forget1026.board.dto.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> selectBoardList() throws Exception;
}
