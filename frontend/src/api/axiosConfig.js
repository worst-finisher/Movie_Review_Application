import axios from 'axios';

export default axios.create({
    baseURL: 'http://localhost:8080' // Use 'http' instead of 'https'
});