/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.regitiny.catiny.messenger.web.rest.example.api;

import io.swagger.annotations.*;
import org.regitiny.catiny.messenger.web.rest.example.api.model.Message;
import org.regitiny.catiny.messenger.web.rest.example.api.model.Topic;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-19T21:01:24.515+07:00[Asia/Bangkok]")

@Validated
@Api(value = "messages", description = "the messages API")
public interface MessagesApi
{

  default MessagesApiDelegate getDelegate()
  {
    return new MessagesApiDelegate()
    {
    };
  }


  /**
   * POST /messages/topic : Create topic
   * Create a topic
   *
   * @param body (required)
   * @return create topic succsessful (status code 200)
   */
  @ApiOperation(value = "Create topic", nickname = "createTopic", notes = "Create a topic", tags = {"messages",})
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "create topic succsessful")})
  @RequestMapping(value = "/messages/topic",
    consumes = {"application/json"},
    method = RequestMethod.POST)
  default ResponseEntity<Void> createTopic(@ApiParam(value = "", required = true) @Valid @RequestBody Topic body)
  {
    return getDelegate().createTopic(body);
  }


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
  @RequestMapping(value = "/messages/{messageId}",
    method = RequestMethod.DELETE)
  default ResponseEntity<Void> deleteMessage(@ApiParam(value = "", required = true) @PathVariable("messageId") String messageId)
  {
    return getDelegate().deleteMessage(messageId);
  }


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
  @RequestMapping(value = "/messages/send",
    consumes = {"application/json"},
    method = RequestMethod.POST)
  default ResponseEntity<Void> sendMessage(@ApiParam(value = "Information and the content of the message", required = true) @Valid @RequestBody Message body)
  {
    return getDelegate().sendMessage(body);
  }


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
  @RequestMapping(value = "/messages/{messageId}",
    consumes = {"application/json"},
    method = RequestMethod.PUT)
  default ResponseEntity<Void> updateMessage(@ApiParam(value = "", required = true) @PathVariable("messageId") String messageId, @ApiParam(value = "Content to edit") @Valid @RequestBody(required = false) Message body)
  {
    return getDelegate().updateMessage(messageId, body);
  }

}