
package questionmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the questionmodel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://QuestionModel/", "Exception");
    private final static QName _DeleteQuesetion_QNAME = new QName("http://QuestionModel/", "deleteQuesetion");
    private final static QName _DeleteQuesetionResponse_QNAME = new QName("http://QuestionModel/", "deleteQuesetionResponse");
    private final static QName _GetQuestion_QNAME = new QName("http://QuestionModel/", "getQuestion");
    private final static QName _GetQuestionResponse_QNAME = new QName("http://QuestionModel/", "getQuestionResponse");
    private final static QName _InsertQuestion_QNAME = new QName("http://QuestionModel/", "insertQuestion");
    private final static QName _InsertQuestionResponse_QNAME = new QName("http://QuestionModel/", "insertQuestionResponse");
    private final static QName _UpdateQuestion_QNAME = new QName("http://QuestionModel/", "updateQuestion");
    private final static QName _UpdateQuestionResponse_QNAME = new QName("http://QuestionModel/", "updateQuestionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: questionmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DeleteQuesetion }
     * 
     */
    public DeleteQuesetion createDeleteQuesetion() {
        return new DeleteQuesetion();
    }

    /**
     * Create an instance of {@link DeleteQuesetionResponse }
     * 
     */
    public DeleteQuesetionResponse createDeleteQuesetionResponse() {
        return new DeleteQuesetionResponse();
    }

    /**
     * Create an instance of {@link GetQuestion }
     * 
     */
    public GetQuestion createGetQuestion() {
        return new GetQuestion();
    }

    /**
     * Create an instance of {@link GetQuestionResponse }
     * 
     */
    public GetQuestionResponse createGetQuestionResponse() {
        return new GetQuestionResponse();
    }

    /**
     * Create an instance of {@link InsertQuestion }
     * 
     */
    public InsertQuestion createInsertQuestion() {
        return new InsertQuestion();
    }

    /**
     * Create an instance of {@link InsertQuestionResponse }
     * 
     */
    public InsertQuestionResponse createInsertQuestionResponse() {
        return new InsertQuestionResponse();
    }

    /**
     * Create an instance of {@link UpdateQuestion }
     * 
     */
    public UpdateQuestion createUpdateQuestion() {
        return new UpdateQuestion();
    }

    /**
     * Create an instance of {@link UpdateQuestionResponse }
     * 
     */
    public UpdateQuestionResponse createUpdateQuestionResponse() {
        return new UpdateQuestionResponse();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteQuesetion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "deleteQuesetion")
    public JAXBElement<DeleteQuesetion> createDeleteQuesetion(DeleteQuesetion value) {
        return new JAXBElement<DeleteQuesetion>(_DeleteQuesetion_QNAME, DeleteQuesetion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteQuesetionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "deleteQuesetionResponse")
    public JAXBElement<DeleteQuesetionResponse> createDeleteQuesetionResponse(DeleteQuesetionResponse value) {
        return new JAXBElement<DeleteQuesetionResponse>(_DeleteQuesetionResponse_QNAME, DeleteQuesetionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "getQuestion")
    public JAXBElement<GetQuestion> createGetQuestion(GetQuestion value) {
        return new JAXBElement<GetQuestion>(_GetQuestion_QNAME, GetQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "getQuestionResponse")
    public JAXBElement<GetQuestionResponse> createGetQuestionResponse(GetQuestionResponse value) {
        return new JAXBElement<GetQuestionResponse>(_GetQuestionResponse_QNAME, GetQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "insertQuestion")
    public JAXBElement<InsertQuestion> createInsertQuestion(InsertQuestion value) {
        return new JAXBElement<InsertQuestion>(_InsertQuestion_QNAME, InsertQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "insertQuestionResponse")
    public JAXBElement<InsertQuestionResponse> createInsertQuestionResponse(InsertQuestionResponse value) {
        return new JAXBElement<InsertQuestionResponse>(_InsertQuestionResponse_QNAME, InsertQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "updateQuestion")
    public JAXBElement<UpdateQuestion> createUpdateQuestion(UpdateQuestion value) {
        return new JAXBElement<UpdateQuestion>(_UpdateQuestion_QNAME, UpdateQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionModel/", name = "updateQuestionResponse")
    public JAXBElement<UpdateQuestionResponse> createUpdateQuestionResponse(UpdateQuestionResponse value) {
        return new JAXBElement<UpdateQuestionResponse>(_UpdateQuestionResponse_QNAME, UpdateQuestionResponse.class, null, value);
    }

}