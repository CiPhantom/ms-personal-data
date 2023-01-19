package org.comedy.app.controller.handler.structure;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ErrorResponse {
    List<Error> errors;
}
