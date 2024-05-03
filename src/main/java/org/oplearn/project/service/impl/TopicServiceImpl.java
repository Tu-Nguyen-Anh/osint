package org.oplearn.project.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.oplearn.project.dto.request.TopicRequest;
import org.oplearn.project.dto.response.TopicResponse;
import org.oplearn.project.entity.Topic;
import org.oplearn.project.repository.TopicRepository;
import org.oplearn.project.service.TopicService;
import org.springframework.stereotype.Service;

import static org.oplearn.project.utils.GenerateIdUtils.generateId;

@Service
@RequiredArgsConstructor
@Slf4j
public class TopicServiceImpl implements TopicService {

  private final TopicRepository repository;

  @Override
  public TopicResponse create(TopicRequest request) {
    log.info("(create) :{}", request);

    Topic topic = Topic.from(request.getName());
    topic.setId(generateId());

    topic = repository.save(topic);

    return new TopicResponse(topic.getName());
  }
}
