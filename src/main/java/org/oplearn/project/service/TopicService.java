package org.oplearn.project.service;

import org.oplearn.project.dto.request.TopicRequest;
import org.oplearn.project.dto.response.TopicResponse;

public interface TopicService {
  TopicResponse create(TopicRequest request);
}
