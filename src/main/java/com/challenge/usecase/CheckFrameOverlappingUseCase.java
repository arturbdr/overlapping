package com.challenge.usecase;

import com.challenge.domain.Frame;
import org.springframework.stereotype.Service;

@Service
public class CheckFrameOverlappingUseCase {

    public boolean areFramesOverlapping(final Frame frameA, final Frame frameB) {
        if (frameB.getBottomLeftX() > frameA.getTopRightX() ||
                frameB.getBottomLeftY() > frameA.getTopRightY() ||
                frameA.getBottomLeftX() > frameB.getTopRightX() ||
                frameA.getBottomLeftY() > frameB.getTopRightY()) {
            return false;
        }
        return true;
    }
}
