package org.comedy.app.controller.handler.structure;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.comedy.domain.exception.error.ErrorCode;

@Getter
@Setter
@Builder
public class Error {
    private ErrorCode errorCode;
    private String message;
}
