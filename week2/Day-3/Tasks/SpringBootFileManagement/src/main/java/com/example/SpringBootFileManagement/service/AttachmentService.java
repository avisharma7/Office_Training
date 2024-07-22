package com.example.SpringBootFileManagement.service;

import com.example.SpringBootFileManagement.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment(MultipartFile file) throws  Exception;

    Attachment getAttachment(String fileId) throws Exception;
}
