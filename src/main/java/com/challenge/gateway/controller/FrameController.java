package com.challenge.gateway.controller;

import com.challenge.domain.Frame;
import com.challenge.usecase.CheckFrameOverlappingUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FrameController {

    private final CheckFrameOverlappingUseCase checkFrameOverlappingUseCase;

    @GetMapping("/frames/overlaping")
    public ResponseEntity<Boolean> areFramesOverlapping(int frameABottomLeftX,
                                                        int frameABottomLeftY,
                                                        int frameATopRightX,
                                                        int frameATopRightY,
                                                        int frameBBottomLeftX,
                                                        int frameBBottomLeftY,
                                                        int frameBTopRightX,
                                                        int frameBTopRightY) {
        boolean areFramesOverlapping = checkFrameOverlappingUseCase.areFramesOverlapping(
                buildFrame(frameABottomLeftX,
                        frameABottomLeftY,
                        frameATopRightX,
                        frameATopRightY),
                buildFrame(frameBBottomLeftX,
                        frameBBottomLeftY,
                        frameBTopRightX,
                        frameBTopRightY));
        return ResponseEntity.ok(areFramesOverlapping);
    }

    Frame buildFrame(int bottomLeftX,
                     int bottomLeftY,
                     int topRightX,
                     int topRightY) {
        return Frame.builder()
                .bottomLeftX(bottomLeftX)
                .bottomLeftY(bottomLeftY)
                .topRightX(topRightX)
                .topRightY(topRightY)
                .build();
    }

}
