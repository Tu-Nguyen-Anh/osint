package org.oplearn.project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.oplearn.project.dto.request.TopicRequest;
import org.oplearn.project.dto.response.ResponseGeneral;
import org.oplearn.project.dto.response.TopicResponse;
import org.oplearn.project.service.TopicService;
import org.oplearn.project.service.base.MessageService;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import static org.oplearn.project.constanst.OpLearnConstants.CommonConstants.*;

@RestController
@RequestMapping("api/v1/topics")
@RequiredArgsConstructor
@Slf4j
public class TopicController {

  private final TopicService topicService;
  private final MessageService messageService;

  @PostMapping
  public ResponseGeneral<TopicResponse> create(
        @RequestBody TopicRequest request,
        @RequestHeader(name = LANGUAGE, defaultValue = DEFAULT_LANGUAGE) String language) {
    log.info("(create) :{}", request);

    return ResponseGeneral.ofSuccess(
          messageService.getMessage(SUCCESS,language),
          topicService.create(request)
    );
  }

}
