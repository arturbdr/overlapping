package com.challenge.gateway.controller.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FrameDTO {
    int bottomLeftX;
    int bottomLeftY;
    int topRightX;
    int topRightY;
}
