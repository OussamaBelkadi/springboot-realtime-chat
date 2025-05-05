package os.real_time_chat.enums;

import lombok.*;

import java.awt.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class ChatMessage {
    private  String content;
    private String sender;
    private MessageType messageType;
}
