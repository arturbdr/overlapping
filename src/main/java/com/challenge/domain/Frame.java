package com.challenge.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Frame {
    int bottomLeftX;
    int bottomLeftY;
    int topRightX;
    int topRightY;
}
