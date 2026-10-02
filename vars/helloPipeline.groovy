def call(String environment = 'development') {
    echo "Hello from Jenkins Shared Library!"
    echo "Reusable CI/CD logic is working."
    echo "Environment: ${environment}"
}
