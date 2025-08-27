package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        // TODO: Implement mapping according to README canonical expectations.
        // Requirements:
        // - null or blank -> "Please say something."
        // - For known messages, return exact string for each ReplyType.
        // - For unknown messages, return the 'any other text' mapping.
        if (message == null || message.trim().isEmpty())
        {
            return ("Please say something.");
        }

        else if (message.equalsIgnoreCase("hi"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("Hello. How may I assist you today?");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("Hey there! \uD83D\uDE0A How can I help?");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("Hello. How can I help?");
            }
        }

        else if (message.equalsIgnoreCase("hello"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("Hello. How may I assist you today?");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("Hi! \uD83D\uDC4B What’s up?");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("Hello. How can I help?");
            }
        }

        else if (message.equalsIgnoreCase("how are you"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("I am functioning properly. How may I assist you?");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("Doing great! \uD83D\uDE04 How can I help?");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("I’m good. How can I help?");
            }
        }

        else if (message.equalsIgnoreCase("i need help"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("I can assist with that. Please provide more details.");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("I’ve got you! \uD83D\uDE42 Tell me a bit more.");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("Share details; I’ll help.");
            }
        }

        else if (message.equalsIgnoreCase("can you help me with my account"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("Certainly. Please describe the account issue.");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("Sure thing! \uD83D\uDE0A What’s wrong with the account?");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("Describe the account issue…");
            }
        }

        else if (message.equalsIgnoreCase("thanks"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("You are welcome.");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("Anytime! \uD83D\uDE4C");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("You’re welcome.");
            }
        }

        else if (message.equalsIgnoreCase("bye"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("Goodbye.");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("See you later! \uD83D\uDC4B");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("Goodbye.");
            }
        }

        else if (message.equalsIgnoreCase("what is your name"))
        {
            if (type == ReplyType.FORMAL)
            {
                return ("I am your virtual assistant.");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("I’m your helper bot \uD83E\uDD16");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("I’m your assistant.");
            }
        }

        else
        {
            if (type == ReplyType.FORMAL)
            {
                return ("Could you clarify your request?");
            }
            else if (type == ReplyType.FRIENDLY)
            {
                return ("Could you tell me more?");
            }
            else if (type == ReplyType.CONCISE)
            {
                return ("Please clarify.");
            }
        }
        return ("Please say something.");
    }
}
