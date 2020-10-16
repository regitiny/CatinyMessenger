/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.regitiny.catiny.messenger.web.openapi;

import io.swagger.annotations.*;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@Api(value = "messages", description = "the messages API")
@RequestMapping("/apix/message/")
public interface MessagesApi
{

  /**
   * DELETE /messages/{messageId} : Delete message
   * Delete a message by messageId
   *
   * @param messageId (required)
   * @return delete message successful (status code 200)
   */
  @ApiOperation(value = "Delete message", nickname = "deleteMessage", notes = "Delete a message by messageId", tags = {"messages",})
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "delete message successful")})
  @DeleteMapping(value = "{messageId}", consumes = "application/json", produces = "application/json")
  ResponseEntity<Void> deleteMessage(@ApiParam(value = "", required = true) @PathVariable("messageId") String messageId);


  /**
   * POST /messages/send : send message
   * Send a message to a topic
   *
   * @param body Information and the content of the message (required)
   * @return send message successful (status code 200)
   * or Validation exception (status code 405)
   */
  @ApiOperation(value = "send message", nickname = "sendMessage", notes = "Send a message to a topic", tags = {"messages",})
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "send message successful"),
    @ApiResponse(code = 405, message = "Validation exception")})
  @PostMapping(value = "send", consumes = "application/json", produces = "application/json")
  ResponseEntity<Void> sendMessage(@ApiParam(value = "Information and the content of the message", required = true) @Valid @RequestBody Message body);


  /**
   * PUT /messages/{messageId} : Edit message
   * Edit a message by messageID
   *
   * @param messageId (required)
   * @param body      Content to edit (optional)
   * @return edit message successful (status code 200)
   * or Invalid ID supplied (status code 400)
   * or Message not found (status code 404)
   * or Validation exception (status code 405)
   */
  @ApiOperation(value = "Edit message", nickname = "updateMessage", notes = "Edit a message by messageID", tags = {"messages",})
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "edit message successful"),
    @ApiResponse(code = 400, message = "Invalid ID supplied"),
    @ApiResponse(code = 404, message = "Message not found"),
    @ApiResponse(code = 405, message = "Validation exception")})
  @PutMapping(value = "{messageId}", consumes = "application/json", produces = "application/json")
  ResponseEntity<Void> updateMessage(@ApiParam(value = "", required = true) @PathVariable("messageId") String messageId, @ApiParam(value = "Content to edit") @Valid @RequestBody(required = false) Message body);


  @GetMapping
  String pipi();


  @Data
  class Message
  {
    private String sender;

    private String sendDate;

    private String topicId;
  }
}
