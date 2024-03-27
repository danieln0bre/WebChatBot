import requests

def ask_question(question):
    url = "http://localhost:8080/chatbot"  # Assuming the API is running locally
    data = question
    response = requests.post(url, json=data)
    if response.status_code == 200:
        return response.text
    else:
        return f"Error: {response.status_code}"

if __name__ == "__main__":
    question = input("Enter your question: ")
    response = ask_question(question)
    print("Response from ChatBot:", response)
